variable "region" {
  type        = string
  description = "the Google Cloud region"
  default     = "europe-west4"
}

variable "image" {
  type        = string
  description = "the image to deploy"
  default     = "gcr.io/cloudrun/hello:latest"
}

variable "memory" {
  type        = string
  description = "the memory to use for the container"
  default     = "128Mi"
}
