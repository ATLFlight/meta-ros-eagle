DESCRIPTION = "Holds the action description and relevant messages for the move_base package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=f3aff2a60c07ab8d8790f771b4e3c8ff"

DEPENDS = "catkin ecl-exceptions ecl-threads ecl-time geometry-msgs roscpp std-msgs"
inherit catkin

require yujin-ocs.inc
