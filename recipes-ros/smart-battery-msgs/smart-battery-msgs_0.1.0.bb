SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=f3aff2a60c07ab8d8790f771b4e3c8ff"

PROVIDES = "smart-batttery-msgs" 
# https://github.com/ros-drivers/smart_battery_msgs/archive/0.1.0.tar.gz
DEPENDS = "catkin message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-drivers/smart_battery_msgs/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e4708835f36e4066f7bb5cd59ee42081"
SRC_URI[sha256sum] = "f280a574b8b53e4b43c19da634932c82633c4f4dee23694626d807b5587f6788"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
