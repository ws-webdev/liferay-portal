/**
 * Copyright (c) 2000-2008 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.portlet.documentlibrary.service.persistence;

/**
 * <a href="DLFileEntryFinderUtil.java.html"><b><i>View Source</i></b></a>
 *
 * @author Brian Wing Shun Chan
 *
 */
public class DLFileEntryFinderUtil {
	public static int countByFolderIds(java.util.List<Long> folderIds)
		throws com.liferay.portal.SystemException {
		return getFinder().countByFolderIds(folderIds);
	}

	public static int countByGroupId(long groupId)
		throws com.liferay.portal.SystemException {
		return getFinder().countByGroupId(groupId);
	}

	public static int countByG_U(long groupId, long userId)
		throws com.liferay.portal.SystemException {
		return getFinder().countByG_U(groupId, userId);
	}

	public static java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> findByGroupId(
		long groupId, int start, int end)
		throws com.liferay.portal.SystemException {
		return getFinder().findByGroupId(groupId, start, end);
	}

	public static java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException {
		return getFinder().findByGroupId(groupId, start, end, obc);
	}

	public static java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> findByNoAssets()
		throws com.liferay.portal.SystemException {
		return getFinder().findByNoAssets();
	}

	public static java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> findByG_U(
		long groupId, long userId, int start, int end)
		throws com.liferay.portal.SystemException {
		return getFinder().findByG_U(groupId, userId, start, end);
	}

	public static java.util.List<com.liferay.portlet.documentlibrary.model.DLFileEntry> findByG_U(
		long groupId, long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator obc)
		throws com.liferay.portal.SystemException {
		return getFinder().findByG_U(groupId, userId, start, end, obc);
	}

	public static com.liferay.portlet.documentlibrary.model.DLFileEntry findByUuid_G(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.SystemException,
			com.liferay.portlet.documentlibrary.NoSuchFileEntryException {
		return getFinder().findByUuid_G(uuid, groupId);
	}

	public static DLFileEntryFinder getFinder() {
		return _getUtil()._finder;
	}

	public void setFinder(DLFileEntryFinder finder) {
		_finder = finder;
	}

	private static DLFileEntryFinderUtil _getUtil() {
		if (_util == null) {
			_util = (DLFileEntryFinderUtil)com.liferay.portal.kernel.bean.BeanLocatorUtil.locate(_UTIL);
		}

		return _util;
	}

	private static final String _UTIL = DLFileEntryFinderUtil.class.getName();
	private static DLFileEntryFinderUtil _util;
	private DLFileEntryFinder _finder;
}