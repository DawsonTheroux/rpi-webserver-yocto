# Yocto project to run a secure Raspberry Pi webserver.

## Description
The goal of this project is to build a yocto image with all dependencies installed for to host portfiolio webserver.

Goals:
	- Configure Firewall from Yocto.
	- Setup system server to execute server on startup.
	- ...

## Build instructions
	1. Setup git environment to be capable of cloning private portfolio-website repository in Bitbake
	2. Pull the dependency repositories with the setup-repos.sh script.
	3. Initilize the environment with the env-init.sh script
	4. Build the project with the ../build.sh script.
