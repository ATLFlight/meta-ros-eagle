DESCRIPTION = "Holds the action description and relevant messages for the move_base package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=b0212776e9c4ae69800a0a4a06e0ad25"

DEPENDS = "catkin diagnostic-msgs rospy sensor-msgs"
inherit catkin

require zeroconf-avahi-suite.inc
