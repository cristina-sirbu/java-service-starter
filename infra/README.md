## Note: Plan-Only Mode

This Terraform configuration is used in **plan-only mode** for demonstration purposes. No real infrastructure is created.

To simulate the deployment:

1. Authenticate locally with GCP:
   ```shell
   gcloud auth application-default login
   ```
2. Run Terraform plan with a sample config:
   ```shell
   terraform init
   terraform plan -var-file="terraform.tfvars.example"
   ```
_Disclaimer_: No `terraform apply` command is run such that no billing is incurred. This allows the project to showcase 
infrastructure-as-code without requiring an active GCP deployment or cost.

If you plan to run `terraform apply` and deploy to GCP:
1. Push your Docker image to a container registry. You can build and push using:
   ```bash
   docker build -t gcr.io/YOUR_PROJECT_ID/mini-apollo:latest .
   docker push gcr.io/YOUR_PROJECT_ID/mini-apollo:latest
   ```
2. Update `terraform.tfvars.example` by:
   * Replacing placeholders (project_id, image) with real values.
   * Saving the file as terraform.tfvars before running apply.