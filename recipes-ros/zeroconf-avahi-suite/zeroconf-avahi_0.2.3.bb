DESCRIPTION = "Holds the action description and relevant messages for the move_base package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=588163a7815884096b23326b69d819f7"

DEPENDS = "catkin diagnostic-msgs rospy sensor-msgs smart-battery-msgs"
inherit catkin

require zeroconf-avahi-suite.inc
