DESCRIPTION = "ROS: yujin-ocs "
SECTION = "devel"
LICENSE = "BSD"

#PROVIDES = "yujin-ocs" 

DEPENDS = "move-base-msgs message-runtime"
# https://github.com/yujinrobot/yujin_ocs/archive/0.6.4.tar.gz
SRC_URI = "https://github.com/yujinrobot/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "18f072a78c9435a3177cf6929635cb48"
SRC_URI[sha256sum] = "cf06746dcced3bf53f24839155b0c51614d50cbf03d50b5dab54299f4a9563cc"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"


#S = "${WORKDIR}/${ROS_SP}/yujin_ocs"
#S += "${WORKDIR}/${ROS_SP}/yocs_math_toolkit"
#S += "${WORKDIR}/${ROS_SP}/yocs_controllers"
#S += "${WORKDIR}/${ROS_SP}/yocs_ar_marker_tracking"
#S += "${WORKDIR}/${ROS_SP}/yocs_ar_pair_approach"
#S += "${WORKDIR}/${ROS_SP}/yocs_ar_pair_tracking"
#S += "${WORKDIR}/${ROS_SP}/yocs_cmd_vel_mux"
#S += "${WORKDIR}/${ROS_SP}/yocs_diff_drive_pose_controller"
#S += "${WORKDIR}/${ROS_SP}/yocs_joyop"
#S += "${WORKDIR}/${ROS_SP}/yocs_keypo"
#S += "${WORKDIR}/${ROS_SP}/yocs_localization_manager"
#S += "${WORKDIR}/${ROS_SP}/yocs_navigator"
#S += "${WORKDIR}/${ROS_SP}/yocs_rapps"
#S += "${WORKDIR}/${ROS_SP}/yocs_safety_controller"
#S += "${WORKDIR}/${ROS_SP}/yocs_velocity_smoother"
#S += "${WORKDIR}/${ROS_SP}/yocs_virtual_sensor"
#S += "${WORKDIR}/${ROS_SP}/yocs_waypoint_provider"
#S += "${WORKDIR}/${ROS_SP}/yocs_waypoints_navi"

inherit catkin
ROS_SPN = "yujin_ocs"

