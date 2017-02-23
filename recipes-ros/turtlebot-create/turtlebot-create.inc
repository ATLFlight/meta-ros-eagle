SRC_URI = "https://github.com/turtlebot/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
# https://github.com/turtlebot/turtlebot_create/archive/2.3.1.tar.gz
SRC_URI[md5sum] = "ced498c5e3089075ffc5211cb69d2559"
SRC_URI[sha256sum] = "49ed2bf9653eca5a35547d18422637b0c0f68426c6ed451754ca8c3dbbc14204"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"


inherit catkin
ROS_SPN = "turtlebot_create"
