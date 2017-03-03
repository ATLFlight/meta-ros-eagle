SECTION = "devel"
LICENSE = "as-is"
LIC_FILES_CHKSUM = "file://BulletLicense.txt;beginline=4;endline=15;md5=7c4b13b0e8adb6af8095659050b869d8"

PROVIDES = "bullet" 

DEPENDS = "catkin ecl-eigen"
SRC_URI = "https://storage.googleapis.com/google-code-archive-downloads/v2/code.google.com/bullet/bullet-2.82-r2704.tgz;downloadfilename=${ROS_SP}.tar.gz"
#https://storage.googleapis.com/google-code-archive-downloads/v2/code.google.com/bullet/bullet-2.82-r2704.tgz

SRC_URI[md5sum] = "70b3c8d202dee91a0854b4cbc88173e8"
SRC_URI[sha256sum] = "67e4c9eb76f7adf99501d726d8ad5e9b525dfd0843fbce9ca73aaca4ba9eced2"

S = "${WORKDIR}/${ROS_SP}-r2704"

inherit catkin
