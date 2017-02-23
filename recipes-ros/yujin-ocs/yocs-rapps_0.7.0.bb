DESCRIPTION = "Holds the action description and relevant messages for the move_base package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=dd4c04a9262e094ac376569220a08397"

DEPENDS = "catkin yocs-velocity-smoother"
inherit catkin

require yujin-ocs.inc
