SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=304da251f4aa1e3d0c911e8d4e763193"

PROVIDES = "robot-state-publisher" 

DEPENDS = "catkin kdl-parser orocos-kdl rosconsole roscpp rostest rostime sensor-msgs tf tf2-kdl tf2-ros "
SRC_URI = "https://github.com/ros/robot_state_publisher/archive/${PV}.tar.gz;downloadfilename=robot_state_publisher.tar.gz"
#https://github.com/ros/robot_state_publisher/archive/1.11.2.tar.gz

SRC_URI[md5sum] = "f10d326400fd97f349a19a330c65aa3a"
SRC_URI[sha256sum] = "33b7606f0ea913e22887fe30521c94c1167f56197c03ce2985fc778876ea2141"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
