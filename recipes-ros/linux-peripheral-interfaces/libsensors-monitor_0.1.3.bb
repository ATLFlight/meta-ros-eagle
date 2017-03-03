DESCRIPTION = "Holds the action description and relevant messages for the move_base package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=9e9b638fd51a18227e4b2b0879955037"

DEPENDS = "catkin diagnostic-msgs rospy sensor-msgs"
inherit catkin

require linux-peripheral-interfaces.inc
