SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

PROVIDES = "turtlebot_msgs" 

DEPENDS = "catkin message-generation message-runtime sensor-msgs std-msgs std-srvs"
#https://github.com/turtlebot/turtlebot_msgs/archive/2.2.1.tar.gz
SRC_URI = "https://github.com/turtlebot/turtlebot_msgs/archive/2.2.1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8abbe6e5654506174d52270076f76d11"
SRC_URI[sha256sum] = "02a5643604a20d5b15d0492e6f42c9e1f79acab8cdfdbd8bbff80f293ccda0ff"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
