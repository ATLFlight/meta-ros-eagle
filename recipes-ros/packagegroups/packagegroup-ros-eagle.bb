DESCRIPTION = "ros-eagle package group"
LICENSE = "MIT"

inherit packagegroup

PACKAGES = "${PN}"

RDEPENDS_${PN} = "\
    packagegroup-ros-comm \
    actionlib \
    bond \
    bondcpp \
    bondpy \
    smclib \
    class-loader \
    actionlib-msgs \
    diagnostic-msgs \
    nav-msgs \
    geometry-msgs \
    sensor-msgs \
    shape-msgs \
    stereo-msgs \
    trajectory-msgs \
    visualization-msgs \
    dynamic-reconfigure \
    tf2 \
    tf2-msgs \
    tf2-py \
    tf2-ros \
    tf \
    image-transport \
    nodelet-topic-tools \
    nodelet \
    pluginlib \
    cmake-modules \
    rosconsole-bridge \
    "

# ar-track-alvar does not compile due to unknown opencv identifiers.
# image-view requires gtk+, but it cannot be found by cmake for some reason.
# sound-play requires python-gst (which is not available in any layers' master branch)
# joint-state-publisher still has some issues.
# freenect-camera and freenect-launch requires opengl distro feature.
