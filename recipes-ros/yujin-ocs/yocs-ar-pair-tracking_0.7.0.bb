DESCRIPTION = "Holds the action description and relevant messages for the move_base package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin roscpp std-msgs gemetry-msgs sensor-msgs yocs-math-toolkit ar-track-alvar-msgs yocs-msgs roscpp rospy std-msgs tf geometry-msgs yocs-ar-marker-tracking"
inherit catkin

require yujin-ocs.inc
