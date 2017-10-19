DESCRIPTION = "\
The nodelet package is designed to provide a way to run multiple \
algorithms in the same process with zero copy transport between \
algorithms. \
This package provides both the nodelet base class needed for \
implementing a nodelet, as well as the NodeletLoader class used \
for instantiating nodelets\
"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=40e3d865780ec900fda526e6c2aef395"

PROVIDES = "${PN}"

DEPENDS = "bondcpp boost message-generation pluginlib rosconsole roscpp rospy std-msgs libtinyxml"

require nodelet-core.inc
