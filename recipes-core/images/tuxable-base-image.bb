inherit core-image

IMAGE_FEATURES += "ssh-server-openssh"

WIFI_PKGS = " \
	${@bb.utils.contains('COMBINED_FEATURES', 'wifi', 'connman-client', '',d)} \
"

IMAGE_INSTALL += " \
	bash \
	${WIFI_PKGS} \
"
