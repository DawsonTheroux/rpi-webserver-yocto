#!/bin/bash

mkdir sources
cd sources

echo && echo "Cloning poky..." && echo
git clone https://github.com/yoctoproject/poky.git -b scarthgap

echo && echo "Cloning meta-openembedded..." && echo
git clone https://github.com/openembedded/meta-openembedded.git -b scarthgap

echo && echo "Cloning meta-raspberrypi..." && echo
git clone https://github.com/agherzan/meta-raspberrypi.git -b scarthgap
