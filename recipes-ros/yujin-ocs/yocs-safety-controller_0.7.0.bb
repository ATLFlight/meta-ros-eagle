DESCRIPTION = "Holds the action description and relevant messages for the move_base package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=2baf3778e8c4d02606f82d7d95809820"
DEPENDS = "catkin ecl-threads geometry-msgs kobuki-msgs nodelet pluginlib roscpp std-msgs yocs-controllers"
inherit catkin

require yujin-ocs.inc
