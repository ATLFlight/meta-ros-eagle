SRC_URI = "https://github.com/robotics-in-concert/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
#https://github.com/robotics-in-concert/rocon_tools/archive/0.6.0.tar.gz
SRC_URI[md5sum] = "83f62b6f9aea648432dbd2ef2abe1aaf"
SRC_URI[sha256sum] = "9656b7d608e4bf728033eed9a596a1ab4aa15451f8106e22ae17a4c78afa75a5"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"


inherit catkin
ROS_SPN = "rocon_tools"
