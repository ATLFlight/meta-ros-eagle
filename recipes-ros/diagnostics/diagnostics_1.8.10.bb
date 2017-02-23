DESCRIPTION = "Holds the action description and relevant messages for the move_base package"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=f0b8b7ebbfd8d37298964e60888a25ed"

DEPENDS = "catkin diagnostic-aggregator diagnostic-analysis diagnostic-common-diagnostics diagnostic-updater self-test"
inherit catkin

require diagnostics.inc
