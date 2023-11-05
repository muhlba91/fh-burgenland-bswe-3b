# FH Burgenland: Softwaremanagement 2 - IaC Terraform

This directory contains the Infrastructure as Code example using [Terraform](https://www.terraform.io).

---

## Requirements

- [Terraform](https://developer.hashicorp.com/terraform/downloads)

## Environment Variables

To successfully run, and configure the Pulumi plugins, you need to set a list of environment variables. Alternatively, refer to the used Pulumi provider's configuration documentation.

- `CLOUDSDK_CORE_PROJECT`: the Google Cloud (GCP) project
- `CLOUDSDK_COMPUTE_REGION` the Google Cloud (GCP) region
- `GOOGLE_APPLICATION_CREDENTIALS`: reference to a file containing the Google Cloud (GCP) service account credentials

## Creating the Infrastructure

The stack can be deployed via:

```bash
terraform init
terraform apply
```

## Destroying the Infrastructure

The entire infrastructure can be destroyed via:

```bash
terraform destroy
```
