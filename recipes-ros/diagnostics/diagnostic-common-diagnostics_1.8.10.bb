DESCRIPTION = "Holds the action description and relevant messages for the move_base package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=87e84a904b7dedcb2e66c13843e71cf8"

DEPENDS = "catkin diagnostic-updater rospy tf"
inherit catkin

require diagnostics.inc
