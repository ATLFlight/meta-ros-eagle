DESCRIPTION = "Holds the action description and relevant messages for the move_base package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=24fd3d53572b508fc43a7be809020580"

DEPENDS = "catkin diagnostic-msgs rosbag roslib rostest"
inherit catkin

require diagnostics.inc
