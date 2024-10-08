# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

SUMMARY = ""
# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   node_modules/atob/LICENSE
#   node_modules/atob/LICENSE.DOCS
#   node_modules/jstransformer/LICENSE.md
#   node_modules/p5/license.txt
#   node_modules/qs/LICENSE
#   node_modules/source-map/LICENSE
#   node_modules/to-fast-properties/license
#
# NOTE: multiple licenses have been detected; they have been separated with &
# in the LICENSE value for now since it is a reasonable assumption that all
# of the licenses apply. If instead there is a choice between the multiple
# licenses then you should change the value to separate the licenses with |
# instead of &. If there is any doubt, check the accompanying documentation
# to determine which situation is applicable.
LICENSE = "ISC & MIT"
LIC_FILES_CHKSUM = "file://node_modules/@babel/helper-validator-identifier/LICENSE;md5=b1d0cd283a346e919abb3beeb018279d \
                    file://node_modules/@babel/parser/LICENSE;md5=3b324af8e79986f4a5621efa85dd1292 \
                    file://node_modules/@babel/types/LICENSE;md5=b1d0cd283a346e919abb3beeb018279d \
                    file://node_modules/accepts/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/acorn/LICENSE;md5=f6e380cb54b7b0b1b2f8428b190f4f73 \
                    file://node_modules/array-flatten/LICENSE;md5=44088ba57cb871a58add36ce51b8de08 \
                    file://node_modules/asap/LICENSE.md;md5=6ef000dc4ca2360ae9216d401862c653 \
                    file://node_modules/atob/LICENSE.DOCS;md5=980f12f548ed1abbfc4771f40a8116d3 \
                    file://node_modules/babel-walk/LICENSE.md;md5=d16d4813d6a527afcc748f7b848a56f9 \
                    file://node_modules/body-parser/LICENSE;md5=0afd201e48c7d095454eed4ac1184e40 \
                    file://node_modules/bytes/LICENSE;md5=013e95467eddb048f19a6f5b42820f86 \
                    file://node_modules/call-bind/LICENSE;md5=0eb2c73daa0ecf037cbdf3d0bb0c98d5 \
                    file://node_modules/character-parser/LICENSE;md5=298aca9f9e56a2ab1900d8733f8dbeda \
                    file://node_modules/constantinople/LICENSE;md5=9a1f717a6fc39face4c2fb590535b5be \
                    file://node_modules/content-disposition/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/content-type/LICENSE;md5=f4b767f006864f81a4901347fe4efdab \
                    file://node_modules/cookie/LICENSE;md5=bc85b43b6f963e8ab3f88e63628448ca \
                    file://node_modules/css/LICENSE;md5=90ef7952804baabc5998e10ed048d8c5 \
                    file://node_modules/css/node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/debug/LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99 \
                    file://node_modules/decode-uri-component/license;md5=775415f59d9642dd552fd60e4c0adda4 \
                    file://node_modules/depd/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/destroy/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/doctypes/LICENSE;md5=8f0d967b27a23156bd4eda03ef97a278 \
                    file://node_modules/ee-first/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/encodeurl/LICENSE;md5=272621efa0ff4f18a73221e49ab60654 \
                    file://node_modules/escape-html/LICENSE;md5=f8746101546eeb9e4f6de64bb8bdf595 \
                    file://node_modules/etag/LICENSE;md5=6e8686b7b13dd7ac8733645a81842c4a \
                    file://node_modules/express/LICENSE;md5=5513c00a5c36cd361da863dd9aa8875d \
                    file://node_modules/finalhandler/LICENSE;md5=b506956e5cbfbe0d04f8a5c40107ec89 \
                    file://node_modules/forwarded/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/fresh/LICENSE;md5=373c2cf0978b37e434394a43b4cbbdb4 \
                    file://node_modules/function-bind/LICENSE;md5=e7417c1a8ad83f88bcac21ad440d48b2 \
                    file://node_modules/get-intrinsic/LICENSE;md5=0eb2c73daa0ecf037cbdf3d0bb0c98d5 \
                    file://node_modules/has-symbols/LICENSE;md5=afee57a289508ed4df3456667778aaf6 \
                    file://node_modules/has/LICENSE-MIT;md5=d000afc3c9ff3501a5610197db76a246 \
                    file://node_modules/http-errors/LICENSE;md5=607209623abfcc77b9098f71a0ef52f9 \
                    file://node_modules/iconv-lite/LICENSE;md5=f942263d98f0d75e0e0101884e86261d \
                    file://node_modules/inherits/LICENSE;md5=5b2ef2247af6d355ae9d9f988092d470 \
                    file://node_modules/ipaddr.js/LICENSE;md5=88f60a4b6e44cb849b5d907a7664c0ef \
                    file://node_modules/is-core-module/LICENSE;md5=02b0fb5ff4014a08fd4193bc3e2349e2 \
                    file://node_modules/is-expression/LICENSE.md;md5=52ed80a2250256503a93672c6b8a0365 \
                    file://node_modules/is-promise/LICENSE;md5=b689321798b9c3969e0467719ddacf2e \
                    file://node_modules/is-regex/LICENSE;md5=d22b3eb619d81197fd4f3ca47c2c1ea5 \
                    file://node_modules/js-stringify/LICENSE;md5=b689321798b9c3969e0467719ddacf2e \
                    file://node_modules/media-typer/LICENSE;md5=c6e0ce1e688c5ff16db06b7259e9cd20 \
                    file://node_modules/merge-descriptors/LICENSE;md5=aaf57ba8c5c9bf256fea7e943991a81a \
                    file://node_modules/methods/LICENSE;md5=c16a7dd9f946172f07086576d135d9d3 \
                    file://node_modules/mime-db/LICENSE;md5=c8d3a30332ecb31cfaf4c0a06da18f5c \
                    file://node_modules/mime-types/LICENSE;md5=bf1f9ad1e2e1d507aef4883fff7103de \
                    file://node_modules/mime/LICENSE;md5=8e8ea2ad138ce468f8570a0edbadea65 \
                    file://node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/negotiator/LICENSE;md5=6417a862a5e35c17c904d9dda2cbd499 \
                    file://node_modules/object-assign/license;md5=a12ebca0510a773644101a99a867d210 \
                    file://node_modules/on-finished/LICENSE;md5=1b1f7f9cec194121fdf616b971df7a7b \
                    file://node_modules/parseurl/LICENSE;md5=e7842ed4f188e53e53c3e8d9c4807e89 \
                    file://node_modules/path-parse/LICENSE;md5=4b940f9668dfcb796d2cb98ad94692df \
                    file://node_modules/path-to-regexp/LICENSE;md5=44088ba57cb871a58add36ce51b8de08 \
                    file://node_modules/path/LICENSE;md5=79623fae61611f36261fab2653c26d1f \
                    file://node_modules/process/LICENSE;md5=460a1c62fb575fc77668890ec8d03d0b \
                    file://node_modules/promise/LICENSE;md5=f908224ab18e60b4c2428c7ef33361e7 \
                    file://node_modules/proxy-addr/LICENSE;md5=6e8686b7b13dd7ac8733645a81842c4a \
                    file://node_modules/pug-attrs/LICENSE;md5=8f0d967b27a23156bd4eda03ef97a278 \
                    file://node_modules/pug-code-gen/LICENSE;md5=8f0d967b27a23156bd4eda03ef97a278 \
                    file://node_modules/pug-error/LICENSE;md5=8f0d967b27a23156bd4eda03ef97a278 \
                    file://node_modules/pug-filters/LICENSE;md5=8f0d967b27a23156bd4eda03ef97a278 \
                    file://node_modules/pug-lexer/LICENSE;md5=b689321798b9c3969e0467719ddacf2e \
                    file://node_modules/pug-linker/LICENSE;md5=8f0d967b27a23156bd4eda03ef97a278 \
                    file://node_modules/pug-load/LICENSE;md5=8f0d967b27a23156bd4eda03ef97a278 \
                    file://node_modules/pug-parser/LICENSE;md5=b689321798b9c3969e0467719ddacf2e \
                    file://node_modules/pug-runtime/LICENSE;md5=b689321798b9c3969e0467719ddacf2e \
                    file://node_modules/pug-strip-comments/LICENSE.md;md5=be8462a3830aa4b5fabb849b47b6c7ed \
                    file://node_modules/pug-walk/LICENSE;md5=8f0d967b27a23156bd4eda03ef97a278 \
                    file://node_modules/pug/LICENSE;md5=e264d99b2c2307c893730835de298429 \
                    file://node_modules/range-parser/LICENSE;md5=d4246fb961a4f121eef5ffca47f0b010 \
                    file://node_modules/raw-body/LICENSE;md5=c970d30155ebbdb1903e6de8c0666e18 \
                    file://node_modules/resolve/LICENSE;md5=baa47288b5bd3e657a01886ce3dd0cb6 \
                    file://node_modules/safe-buffer/LICENSE;md5=badd5e91c737e7ffdf10b40c1f907761 \
                    file://node_modules/safer-buffer/LICENSE;md5=3baebc2a17b8f5bff04882cd0dc0f76e \
                    file://node_modules/send/LICENSE;md5=df2b0938eba0709b77ac937e2d552b7a \
                    file://node_modules/send/node_modules/ms/license.md;md5=fd56fd5f1860961dfa92d313167c37a6 \
                    file://node_modules/serve-static/LICENSE;md5=27b1707520b14d0bc890f4e75cd387b0 \
                    file://node_modules/setprototypeof/LICENSE;md5=4846f1626304c2c0f806a539bbc7d54a \
                    file://node_modules/source-map/LICENSE;md5=b1ca6dbc0075d56cbd9931a75566cd44 \
                    file://node_modules/statuses/LICENSE;md5=36e2bc837ce69a98cc33a9e140d457e5 \
                    file://node_modules/toidentifier/LICENSE;md5=1a261071a044d02eb6f2bb47f51a3502 \
                    file://node_modules/token-stream/LICENSE;md5=b689321798b9c3969e0467719ddacf2e \
                    file://node_modules/type-is/LICENSE;md5=0afd201e48c7d095454eed4ac1184e40 \
                    file://node_modules/unpipe/LICENSE;md5=934ab86a8ab081ea0326add08d550739 \
                    file://node_modules/util/LICENSE;md5=d7351a4fc8e956f1a68413490d5e655e \
                    file://node_modules/utils-merge/LICENSE;md5=1cf0906082187f374cb9a63c54eb782c \
                    file://node_modules/vary/LICENSE;md5=13babc4f212ce635d68da544339c962b \
                    file://node_modules/void-elements/LICENSE;md5=59fd674729486594752aefa0ff5a385d \
                    file://node_modules/with/LICENSE;md5=10d1d4024d61361102888126d4347f7b \
                    file://node_modules/assert-never/README.md;md5=b2b231044301c7119389b985fcf0f903 \
                    file://node_modules/cookie-signature/Readme.md;md5=57ae8b42de3dd0c1f22d5f4cf191e15a \
                    file://node_modules/fs/README.md;md5=6d9063b0a7f41d6d064e85769b3e0b35"

SRC_URI = " \
    git://git@github.com/DawsonTheroux/myWebsite.git;protocol=ssh;branch=master \
    npmsw://${THISDIR}/${BPN}/npm-shrinkwrap.json \
    npm://registry.npmjs.org/;package=request;version=latest;subdir=node_modules/request \
    file://start-portfolio-website \
    "


RDEPENDS:${PN} += " nodejs "
# Modify these as desired
PV = "1.0.0+git"
# SRCREV = "f1c04733be4bfdd65eae176b81a4c5a597289b63"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit npm update-rc.d
addtask compile before do_install after do_configure

INITSCRIPT_NAME = "start-portfolio-website"
INITSCRIPT_PARAMS = "start 99 S ."

do_compile() {
    cd ${S}
    npm install --production
}

do_install() {
    install -d ${D}/opt/portfolio-website
    cp -r ${S}/* ${D}/opt/portfolio-website/
    cp -r ${S}/node_modules ${D}/opt/portfolio-website/

    install -d ${D}${sysconfdir}/init.d
    install -m 0755 ${WORKDIR}/start-portfolio-website ${D}${sysconfdir}/init.d/start-portfolio-website

    #install -d ${D}${systemd_system_unitdir}
    #install -m 0644 ${WORKDIR}/portfolio-website.service ${D}${systemd_system_unitdir}
    #install -m 0755 ${WORKDIR}/start-portfolio-website.sh ${D}/opt/portfolio-website/start-portfolio-website.sh
    #install -d ${D}${sysconfdir}
    #install -m 0755 ${WORKDIR}/start-portfolio-website.sh ${D}${sysconfdir}/start-portfolio-website.sh
}

#INITSCRIPT_NAME = "start-portfolio-website.sh"
#INITSCRIPT_PARAMS = "defaults 0 85"
FILES:${PN} += "/opt/portfolio-website"
FILES:${PN} += "${sysconfdir}/*"
#SYSTEMD_SERVICE:${PN} = "porfolio-website.service"

LICENSE:${PN}-babel-helper-validator-identifier = "MIT"
LICENSE:${PN}-babel-parser = "MIT"
LICENSE:${PN}-babel-types = "MIT"
LICENSE:${PN}-accepts = "MIT"
LICENSE:${PN}-acorn = "MIT"
LICENSE:${PN}-array-flatten = "MIT"
LICENSE:${PN}-asap = "MIT"
LICENSE:${PN}-babel-walk = "MIT"
LICENSE:${PN}-body-parser = "MIT"
LICENSE:${PN}-bytes = "MIT"
LICENSE:${PN}-call-bind = "MIT"
LICENSE:${PN}-character-parser = "MIT"
LICENSE:${PN}-constantinople = "MIT"
LICENSE:${PN}-content-disposition = "MIT"
LICENSE:${PN}-content-type = "MIT"
LICENSE:${PN}-cookie = "MIT"
LICENSE:${PN}-css = "ISC & MIT"
LICENSE:${PN}-debug = "MIT"
LICENSE:${PN}-decode-uri-component = "MIT"
LICENSE:${PN}-depd = "MIT"
LICENSE:${PN}-destroy = "MIT"
LICENSE:${PN}-doctypes = "MIT"
LICENSE:${PN}-ee-first = "MIT"
LICENSE:${PN}-encodeurl = "MIT"
LICENSE:${PN}-escape-html = "MIT"
LICENSE:${PN}-etag = "MIT"
LICENSE:${PN}-express = "MIT"
LICENSE:${PN}-finalhandler = "MIT"
LICENSE:${PN}-forwarded = "MIT"
LICENSE:${PN}-fresh = "MIT"
LICENSE:${PN}-function-bind = "MIT"
LICENSE:${PN}-get-intrinsic = "MIT"
LICENSE:${PN}-has = "MIT"
LICENSE:${PN}-has-symbols = "MIT"
LICENSE:${PN}-http-errors = "MIT"
LICENSE:${PN}-iconv-lite = "MIT"
LICENSE:${PN}-inherits = "ISC"
LICENSE:${PN}-ipaddrjs = "MIT"
LICENSE:${PN}-is-core-module = "MIT"
LICENSE:${PN}-is-expression = "MIT"
LICENSE:${PN}-is-promise = "MIT"
LICENSE:${PN}-is-regex = "MIT"
LICENSE:${PN}-js-stringify = "MIT"
LICENSE:${PN}-media-typer = "MIT"
LICENSE:${PN}-merge-descriptors = "MIT"
LICENSE:${PN}-methods = "MIT"
LICENSE:${PN}-mime = "MIT"
LICENSE:${PN}-mime-db = "MIT"
LICENSE:${PN}-mime-types = "MIT"
LICENSE:${PN}-ms = "MIT"
LICENSE:${PN}-negotiator = "MIT"
LICENSE:${PN}-object-assign = "MIT"
LICENSE:${PN}-on-finished = "MIT"
LICENSE:${PN}-parseurl = "MIT"
LICENSE:${PN}-path = "MIT"
LICENSE:${PN}-path-parse = "MIT"
LICENSE:${PN}-path-to-regexp = "MIT"
LICENSE:${PN}-process = "MIT"
LICENSE:${PN}-promise = "MIT"
LICENSE:${PN}-proxy-addr = "MIT"
LICENSE:${PN}-pug = "MIT"
LICENSE:${PN}-pug-attrs = "MIT"
LICENSE:${PN}-pug-code-gen = "MIT"
LICENSE:${PN}-pug-error = "MIT"
LICENSE:${PN}-pug-filters = "MIT"
LICENSE:${PN}-pug-lexer = "MIT"
LICENSE:${PN}-pug-linker = "MIT"
LICENSE:${PN}-pug-load = "MIT"
LICENSE:${PN}-pug-parser = "MIT"
LICENSE:${PN}-pug-runtime = "MIT"
LICENSE:${PN}-pug-strip-comments = "MIT"
LICENSE:${PN}-pug-walk = "MIT"
LICENSE:${PN}-range-parser = "MIT"
LICENSE:${PN}-raw-body = "MIT"
LICENSE:${PN}-resolve = "MIT"
LICENSE:${PN}-safe-buffer = "MIT"
LICENSE:${PN}-safer-buffer = "MIT"
LICENSE:${PN}-send = "MIT"
LICENSE:${PN}-serve-static = "MIT"
LICENSE:${PN}-setprototypeof = "ISC"
LICENSE:${PN}-source-map-resolve = "MIT"
LICENSE:${PN}-statuses = "MIT"
LICENSE:${PN}-toidentifier = "MIT"
LICENSE:${PN}-token-stream = "MIT"
LICENSE:${PN}-type-is = "MIT"
LICENSE:${PN}-unpipe = "MIT"
LICENSE:${PN}-util = "MIT"
LICENSE:${PN}-utils-merge = "MIT"
LICENSE:${PN}-vary = "MIT"
LICENSE:${PN}-void-elements = "MIT"
LICENSE:${PN}-with = "MIT"
