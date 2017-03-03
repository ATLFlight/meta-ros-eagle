SRC_URI = "https://github.com/robotics-in-concert/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
#https://github.com/robotics-in-concert/rocon_multimaster/archive/0.9.0.tar.gz
SRC_URI[md5sum] = "9bd8cf9bfcece0b8a4ab36b1b380de51"
SRC_URI[sha256sum] = "9dda080bd48e556cb0e09584ffd03976518e530ce19fdf21a66ddc4a405f714f"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"


inherit catkin
ROS_SPN = "rocon_multimaster"
