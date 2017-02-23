SRC_URI = "https://github.com/turtlebot/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "948244d802ebc00fac38fb1578161921"
SRC_URI[sha256sum] = "e8a0dcff800355563987556bf7235e52473d4bf5b186dd90106286a23c41a6b2"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"


inherit catkin
ROS_SPN = "turtlebot"
