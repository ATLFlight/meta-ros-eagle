SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=68b329da9893e34099c7d8ad5cb9c940"

PROVIDES = "zeroconf-msgs" 

DEPENDS = "catkin roscpp rospy sensor-msgs tf tf2 visualization-msgs geometry-msgs message-generation message-runtime std-msgs"
# https://github.com/stonier/zeroconf_msgs/archive/0.2.1.tar.gz
SRC_URI = "https://github.com/stonier/zeroconf_msgs/archive/0.2.1.tar.gz;downloadfilename=zeroconf_msgs.tar.gz"

SRC_URI[md5sum] = "38e89e637f855c2ea0e8cb65c02dfd08"
SRC_URI[sha256sum] = "a5bfd788bc2e2aefb07cb3a302a25cbeef2ce7e931a3a273cb1ae9669645a696"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
