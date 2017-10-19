SRC_URI = "https://github.com/ros/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8b06d2c468f97faf7cfe4d797dda766e"
SRC_URI[sha256sum] = "1b6a4676007f3c677c09a6ceb9eac553e47a0c09c38e320d652946d52f3b9ab4"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "nodelet_core"
