#!/bin/bash

artifact_dir="artifacts/"
echo "In directory: $(pwd)"

set -e

bitbake core-image-base

if [ -d "${artifact_dir}" ]; then
	echo "Found ${artifact_dir}...deleting it."
	rm -rf "${artifact_dir}"
fi

mkdir ${artifact_dir}

cp tmp/deploy/images/raspberrypi3/core-image-base-raspberrypi3.rootfs.wic.bz2 ${artifact_dir}
echo "DONE...See artifacts in dir: ${artifact_dir}"


