DESCRIPTION = "Holds the action description and relevant messages for the move_base package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=76a6cb36a88f0bd16d0304a7e8a97bb2"

DEPENDS = "actionlib-msgs geometry-msgs message-generation roscpp"
inherit catkin

require yujin-ocs.inc
