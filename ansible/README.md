# FH Burgenland: Softwaremanagement 2 - Configuration Management Ansible

This directory contains the Configuration Management example using [Ansible](https://www.ansible.com).

---

## Requirements

- Python
- (Optional) [Ansible](https://www.ansible.com)
- (Optional) [Ansible Lint](https://ansible.readthedocs.io/projects/lint/)

## Configuration / Installation

An example inventory can be found in the [inventory](inventory/) directory.

You can install all Python dependencies using the `requirements.txt` and `requirements-test.txt` files.

## Applying the Playbook

The playbook can be run via:

```bash
ansible-playbook -i inventory/inventory.yml site.yml
```

## Linting the Code

The code can be linted via YAMLLint and Ansible Lint:

```bash
yamllint .
ansible-lint site.yml
```
