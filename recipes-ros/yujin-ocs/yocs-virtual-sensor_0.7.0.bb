DESCRIPTION = "Holds the action description and relevant messages for the move_base package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=4949b34dc4b12adadf23e2a53d3015db"

DEPENDS = "catkin geometry-msgs roscpp rospy rospy-msssage-converter sensor-msgs tf visualization-msgs yocs-msgs yocs-math-toolkit"
inherit catkin

require yujin-ocs.inc
