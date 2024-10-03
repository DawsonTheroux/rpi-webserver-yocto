#!/bin/bash

mkdir sources
cd sources

echo && echo "Cloning poky..." && echo
 1878  git clone https://github.com/yoctoproject/poky.git -b scarthgap

echo && echo "Cloning meta-openembedded..." && echo
 1880  git clone https://github.com/openembedded/meta-openembedded.git -b scarthgap

echo && echo "Cloning meta-raspberrypi..." && echo
 1884  git clone https://github.com/agherzan/meta-raspberrypi.git -b scarthgap
