SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

PROVIDES = "cv-bridge" 

DEPENDS = "catkin opencv3 rosconsole sensor-msgs "
# https://github.com/ros-perception/vision_opencv/archive/1.11.15.tar.gz
SRC_URI = "https://github.com/ros-perception/vision_opencv/archive/1.11.15.tar.gz;downloadfilename=vision_opencv.tar.gz"

SRC_URI[md5sum] = "c82bf63ab8ab5630fedc29e872138fc9"
SRC_URI[sha256sum] = "27e4ebed675c79b41a545614f5a95798c1740e487b65fc45ac356c7298330a80"

S = "${WORKDIR}/${ROS_SP}"

inherit catkin
