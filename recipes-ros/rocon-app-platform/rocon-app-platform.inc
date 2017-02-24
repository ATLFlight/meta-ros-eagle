SRC_URI = "https://github.com/robotics-in-concert/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
#https://github.com/robotics-in-concert/rocon_app_platform/archive/0.10.0.tar.gz
SRC_URI[md5sum] = "d31674ce3ed4110897fb48a715cd4ff0"
SRC_URI[sha256sum] = "b27ef453cb91b4ef7d8b9ce3853017e34a64f1267251ae2e1eb44e81aa98dec1"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"


inherit catkin
ROS_SPN = "rocon_app_platform"
