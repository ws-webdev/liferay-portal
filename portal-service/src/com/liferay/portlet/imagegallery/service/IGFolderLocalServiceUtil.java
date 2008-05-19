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

package com.liferay.portlet.imagegallery.service;


/**
 * <a href="IGFolderLocalServiceUtil.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * <p>
 * This class provides static methods for the
 * <code>com.liferay.portlet.imagegallery.service.IGFolderLocalService</code>
 * bean. The static methods of this class calls the same methods of the bean
 * instance. It's convenient to be able to just write one line to call a method
 * on a bean instead of writing a lookup call and a method call.
 * </p>
 *
 * <p>
 * <code>com.liferay.portlet.imagegallery.service.IGFolderLocalServiceFactory</code>
 * is responsible for the lookup of the bean.
 * </p>
 *
 * @author Brian Wing Shun Chan
 *
 * @see com.liferay.portlet.imagegallery.service.IGFolderLocalService
 * @see com.liferay.portlet.imagegallery.service.IGFolderLocalServiceFactory
 *
 */
public class IGFolderLocalServiceUtil {
	public static com.liferay.portlet.imagegallery.model.IGFolder addIGFolder(
		com.liferay.portlet.imagegallery.model.IGFolder igFolder)
		throws com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		return igFolderLocalService.addIGFolder(igFolder);
	}

	public static void deleteIGFolder(long folderId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		igFolderLocalService.deleteIGFolder(folderId);
	}

	public static void deleteIGFolder(
		com.liferay.portlet.imagegallery.model.IGFolder igFolder)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		igFolderLocalService.deleteIGFolder(igFolder);
	}

	public static java.util.List<com.liferay.portlet.imagegallery.model.IGFolder> dynamicQuery(
		com.liferay.portal.kernel.dao.DynamicQueryInitializer queryInitializer)
		throws com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		return igFolderLocalService.dynamicQuery(queryInitializer);
	}

	public static java.util.List<com.liferay.portlet.imagegallery.model.IGFolder> dynamicQuery(
		com.liferay.portal.kernel.dao.DynamicQueryInitializer queryInitializer,
		int start, int end) throws com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		return igFolderLocalService.dynamicQuery(queryInitializer, start, end);
	}

	public static com.liferay.portlet.imagegallery.model.IGFolder updateIGFolder(
		com.liferay.portlet.imagegallery.model.IGFolder igFolder)
		throws com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		return igFolderLocalService.updateIGFolder(igFolder);
	}

	public static com.liferay.portlet.imagegallery.model.IGFolder addFolder(
		long userId, long plid, long parentFolderId, java.lang.String name,
		java.lang.String description, boolean addCommunityPermissions,
		boolean addGuestPermissions)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		return igFolderLocalService.addFolder(userId, plid, parentFolderId,
			name, description, addCommunityPermissions, addGuestPermissions);
	}

	public static com.liferay.portlet.imagegallery.model.IGFolder addFolder(
		java.lang.String uuid, long userId, long plid, long parentFolderId,
		java.lang.String name, java.lang.String description,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		return igFolderLocalService.addFolder(uuid, userId, plid,
			parentFolderId, name, description, addCommunityPermissions,
			addGuestPermissions);
	}

	public static com.liferay.portlet.imagegallery.model.IGFolder addFolder(
		long userId, long plid, long parentFolderId, java.lang.String name,
		java.lang.String description, java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		return igFolderLocalService.addFolder(userId, plid, parentFolderId,
			name, description, communityPermissions, guestPermissions);
	}

	public static com.liferay.portlet.imagegallery.model.IGFolder addFolder(
		java.lang.String uuid, long userId, long plid, long parentFolderId,
		java.lang.String name, java.lang.String description,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		return igFolderLocalService.addFolder(uuid, userId, plid,
			parentFolderId, name, description, addCommunityPermissions,
			addGuestPermissions, communityPermissions, guestPermissions);
	}

	public static com.liferay.portlet.imagegallery.model.IGFolder addFolderToGroup(
		java.lang.String uuid, long userId, long groupId, long parentFolderId,
		java.lang.String name, java.lang.String description,
		java.lang.Boolean addCommunityPermissions,
		java.lang.Boolean addGuestPermissions,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		return igFolderLocalService.addFolderToGroup(uuid, userId, groupId,
			parentFolderId, name, description, addCommunityPermissions,
			addGuestPermissions, communityPermissions, guestPermissions);
	}

	public static void addFolderResources(long folderId,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		igFolderLocalService.addFolderResources(folderId,
			addCommunityPermissions, addGuestPermissions);
	}

	public static void addFolderResources(
		com.liferay.portlet.imagegallery.model.IGFolder folder,
		boolean addCommunityPermissions, boolean addGuestPermissions)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		igFolderLocalService.addFolderResources(folder,
			addCommunityPermissions, addGuestPermissions);
	}

	public static void addFolderResources(long folderId,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		igFolderLocalService.addFolderResources(folderId, communityPermissions,
			guestPermissions);
	}

	public static void addFolderResources(
		com.liferay.portlet.imagegallery.model.IGFolder folder,
		java.lang.String[] communityPermissions,
		java.lang.String[] guestPermissions)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		igFolderLocalService.addFolderResources(folder, communityPermissions,
			guestPermissions);
	}

	public static void deleteFolder(long folderId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		igFolderLocalService.deleteFolder(folderId);
	}

	public static void deleteFolder(
		com.liferay.portlet.imagegallery.model.IGFolder folder)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		igFolderLocalService.deleteFolder(folder);
	}

	public static void deleteFolders(long groupId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		igFolderLocalService.deleteFolders(groupId);
	}

	public static com.liferay.portlet.imagegallery.model.IGFolder getFolder(
		long folderId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		return igFolderLocalService.getFolder(folderId);
	}

	public static com.liferay.portlet.imagegallery.model.IGFolder getFolder(
		long groupId, long parentFolderId, java.lang.String name)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		return igFolderLocalService.getFolder(groupId, parentFolderId, name);
	}

	public static java.util.List<com.liferay.portlet.imagegallery.model.IGFolder> getFolders(
		long groupId) throws com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		return igFolderLocalService.getFolders(groupId);
	}

	public static java.util.List<com.liferay.portlet.imagegallery.model.IGFolder> getFolders(
		long groupId, long parentFolderId)
		throws com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		return igFolderLocalService.getFolders(groupId, parentFolderId);
	}

	public static java.util.List<com.liferay.portlet.imagegallery.model.IGFolder> getFolders(
		long groupId, long parentFolderId, int start, int end)
		throws com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		return igFolderLocalService.getFolders(groupId, parentFolderId, start,
			end);
	}

	public static int getFoldersCount(long groupId, long parentFolderId)
		throws com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		return igFolderLocalService.getFoldersCount(groupId, parentFolderId);
	}

	public static void getSubfolderIds(java.util.List<Long> folderIds,
		long groupId, long folderId) throws com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		igFolderLocalService.getSubfolderIds(folderIds, groupId, folderId);
	}

	public static void reIndex(java.lang.String[] ids)
		throws com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		igFolderLocalService.reIndex(ids);
	}

	public static com.liferay.portal.kernel.search.Hits search(long companyId,
		long groupId, long[] folderIds, java.lang.String keywords)
		throws com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		return igFolderLocalService.search(companyId, groupId, folderIds,
			keywords);
	}

	public static com.liferay.portlet.imagegallery.model.IGFolder updateFolder(
		long folderId, long parentFolderId, java.lang.String name,
		java.lang.String description, boolean mergeWithParentFolder)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		IGFolderLocalService igFolderLocalService = IGFolderLocalServiceFactory.getService();

		return igFolderLocalService.updateFolder(folderId, parentFolderId,
			name, description, mergeWithParentFolder);
	}
}