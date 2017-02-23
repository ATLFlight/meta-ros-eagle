SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin ecl-exceptions ecl-threads ecl-time geometry-msgs kobuki-msgs roscpp std-msgs std-srvs yocs-cmd-vel-mux yocs-velocity-smoother"

inherit catkin
require kobuki.inc


