FILESEXTRAPATHS:prepend := "${THISDIR}/files:"
SRC_URI += "file://dawsontheroux.conf"

do_install:append() {
    # Add the config for dawsontheroux.ca
    install -d ${D}${sysconfdir}/nginx/sites-available
    install -m 0644 ${WORKDIR}/dawsontheroux.conf ${D}${sysconfdir}/nginx/sites-available/dawsontheroux.conf
    ln -sf ${sysconfdir}/nginx/sites-available/dawsontheroux.conf ${D}${sysconfdir}/nginx/sites-enabled/dawsontheroux.conf

    # Remove the default server.
    rm -f ${D}${sysconfdir}/nginx/sites-enabled/default_server
}
