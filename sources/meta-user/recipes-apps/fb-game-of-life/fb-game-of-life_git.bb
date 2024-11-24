SUMMARY = "Frame buffer game of life"
DESCRIPTION = "Frame buffer game of life application"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SUMMARY = ""

SRC_URI = " \
    git://git@github.com/DawsonTheroux/fb-game-of-life.git;protocol=ssh;branch=master \
    "

SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

# Inherit build system support
inherit pkgconfig

# Add build dependencies
# DEPENDS = "virtual/libc"

CFLAGS = "-Iinclude"

do_compile() {
    oe_runmake
    # for some reason oe_runmake doesn't work...
    # make
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/fb-game-of-life ${D}${bindir}/fb-game-of-life
}

FILES_${PN} = "${bindir}/fb-game-of-life"

