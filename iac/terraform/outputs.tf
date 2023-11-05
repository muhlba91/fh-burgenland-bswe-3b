output "url" {
  description = "the Cloud Run URL"
  value       = google_cloud_run_service.demo_api.status[0].url
}
