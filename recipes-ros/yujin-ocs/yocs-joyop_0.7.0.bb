DESCRIPTION = "Holds the action description and relevant messages for the move_base package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=2baf3778e8c4d02606f82d7d95809820"

PROVIDES = "${PN}"

DEPENDS = "catkin ecl-exceptions ecl-time geometry-msgs joy sensor-msgs std-msgs yocs-msgs roscpp"

require yujin-ocs.inc
