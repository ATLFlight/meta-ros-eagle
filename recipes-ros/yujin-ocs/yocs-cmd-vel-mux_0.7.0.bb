DESCRIPTION = "Holds the action description and relevant messages for the move_base package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=a45a55e7415ddaa50b0cc16f2d05b02d"

SRC_URI += "file://0001-cmd-vel-compile.patch"


DEPENDS = "catkin dynamic-reconfigure geometry-msgs nodelet tf pluginlib roscpp "
inherit catkin

require yujin-ocs.inc
