SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=6e6fd9f84c9a0ee41525c3a7e8ccdd9f"

PROVIDES = "capabilities" 

DEPENDS = "catkin bondpy message-generation message-runtime nodelet roslaunch rospy rostest std-msgs std-srvs"
SRC_URI = "https://github.com/osrf/capabilities/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0948b2be673224d2210371c7c1323299"
SRC_URI[sha256sum] = "39c2b64b2b90d1bc03ad5ea643dfa22fef84658536a17872bdff29844fdc7239"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
