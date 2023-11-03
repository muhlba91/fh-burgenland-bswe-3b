resource "google_cloud_run_service" "demo_api" {
  name     = "cloud-run-service-demo-api"
  location = var.region

  template {
    spec {
      containers {
        image = var.image
        resources {
          limits = {
            "memory" = var.memory
            "cpu"    = "1000m"
          }
        }
      }
      container_concurrency = 50
    }
  }
}

data "google_iam_policy" "cloud_run_public_access" {
  binding {
    role = "roles/run.invoker"
    members = [
      "allUsers",
    ]
  }
}

resource "google_cloud_run_service_iam_policy" "public_access" {
  location = google_cloud_run_service.demo_api.location
  project  = google_cloud_run_service.demo_api.project
  service  = google_cloud_run_service.demo_api.name

  policy_data = data.google_iam_policy.cloud_run_public_access.policy_data
}
