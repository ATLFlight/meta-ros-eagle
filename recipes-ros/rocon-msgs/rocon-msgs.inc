SRC_URI = "https://github.com/robotics-in-concert/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
#https://github.com/robotics-in-concert/rocon_msgs/archive/0.10.0.tar.gz
SRC_URI[md5sum] = "3f8850318aede4ad4a92576a23cff116"
SRC_URI[sha256sum] = "4ad547646a00afbeb748e90e80081825aa2c4f5ecc770820365ec446ca955d8a"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"


inherit catkin
ROS_SPN = "rocon_msgs"
