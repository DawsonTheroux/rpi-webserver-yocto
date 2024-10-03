# Source the thing
project_dir="$(pwd)"
local_conf="conf/local.conf"
bblayers_conf="conf/bblayers.conf"
. sources/poky/oe-init-build-env rpi-build

# modify local.conf
sed -i 's/^MACHINE.*$/MACHINE="raspberrypi3"/' ${local_conf}

# Add the merta-raspberrypi layer.
sed -i '/meta-raspberrypi/d' ${bblayers_conf}
sed -i "/^.*meta-yocto-bsp/a\  ${project_dir}/sources/meta-raspberrypi \\\\" ${bblayers_conf}

# Add the meta-user layer.
sed -i '/meta-user/d' ${bblayers_conf}
sed -i "/^.*meta-yocto-bsp/a\  ${project_dir}/sources/meta-user \\\\" ${bblayers_conf}

# Add the meta-networking layer.
sed -i '/meta-networking/d' ${bblayers_conf}
sed -i "/^.*meta-yocto-bsp/a\  ${project_dir}/sources/meta-openembedded/meta-networking \\\\" ${bblayers_conf}

# Add the meta-networking layer.
sed -i '/meta-python/d' ${bblayers_conf}
sed -i "/^.*meta-yocto-bsp/a\  ${project_dir}/sources/meta-openembedded/meta-python \\\\" ${bblayers_conf}

# Add the meta-webserver layer.
sed -i '/meta-webserver/d' ${bblayers_conf}
sed -i "/^.*meta-yocto-bsp/a\  ${project_dir}/sources/meta-openembedded/meta-webserver \\\\" ${bblayers_conf}

# Add the meta-oe layer.
sed -i '/meta-oe/d' ${bblayers_conf}
sed -i "/^.*meta-yocto-bsp/a\  ${project_dir}/sources/meta-openembedded/meta-oe \\\\" ${bblayers_conf}

sed -i '/synaptics-killswitch/d' ${local_conf}
echo 'LICENSE_FLAGS_ACCEPTED = "synaptics-killswitch"' >> ${local_conf}
