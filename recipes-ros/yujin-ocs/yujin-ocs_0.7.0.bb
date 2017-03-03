DESCRIPTION = "Holds the action description and relevant messages for the move_base package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin yocs-cmd-vel-mux yocs-controllers yocs-diff-drive-pose-controler yocs-joyop yocs-keyop yocs-math-toolkit yocs-rapps yocs-safety-controller yocs-virtual-sensor yocs-waypoints-navi yocs-velocity-smoother yocs-msgs"
inherit catkin

require yujin-ocs.inc
