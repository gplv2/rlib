## libsrc/Makefile.am for RLIB

## Copyright (c) 2003-2006 SICOM Systems Inc (bdoan@sicompos.com)
## rlib is free software; you can redistribute it and/or modify
## it under the terms of the GNU General Public License as published by
## the Free Software Foundation; either version 2, or (at your option)
## any later version.

## rlib is distributed in the hope that it will be useful,
## but WITHOUT ANY WARRANTY; without even the implied warranty of
## MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
## GNU General Public License for more details.

## You should have received a copy of the GNU General Public License
## along with this program; if not, write to the Free Software
## Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA
## 02111-1307, USA.

## Report bugs to rlib-devel@lists.sourceforge.net
##
## Process this file with automake to produce Makefile.in

if HAVE_GD
GD_FILES=gdFontMedium.c gdFontMedium.h
endif

lib_LTLIBRARIES = libr.la
libr_la_SOURCES = parsexml.c reportgen.c layout.c graphing.c api.c \
	resolution.c util.c util.h pcode.c pcode_op_functions.c variables.c \
	formatstring.c fxp.c gd.c breaks.c pdf.c html.c txt.c datasource.c \
	csv.c ralloc.c environment.c free.c navigation.c save.c load.c axis.c \
	xml_data_source.c csv_data_source.c rlib_langinfo.c rlib_input.h \
	pcode.h ralloc.h rlib.h charencoder.c charencoder.h rlib_gd.h \
	rlib_langinfo.h datetime.c datetime.h value.c value.h $(GD_FILES)

libr_la_LIBADD = $(RLIB_LIBS) $(top_builddir)/rpdf/librpdf.la

DEF_FILE=libr.def
if WIN32
def_ldflags=-Wl,--output-def,$(DEF_FILE) -avoid-version
endif

libr_la_LDFLAGS = \
	-version-info $(RLIB_LT_CURRENT):$(RLIB_LT_REVISION):$(RLIB_LT_AGE) \
	$(def_ldflags)

rlibincludedir=$(includedir)/rlib
rlibinclude_HEADERS = rlib.h rlib_input.h charencoder.h datetime.h\
	util.h value.h pcode.h

AM_CFLAGS = $(RLIB_CFLAGS) $(RLIB_WERROR) -I../rpdf

EXTRA_DIST = rlib.i generate_bindings.sh
