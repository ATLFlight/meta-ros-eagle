DESCRIPTION = "Holds the action description and relevant messages for the move_base package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=4d57d34e9023ca66afa6f51aaf9e37d5"

DEPENDS = "catkin diagnostic-msgs rospy sensor-msgs smart-battery-msgs"
inherit catkin

require linux-peripheral-interfaces.inc
