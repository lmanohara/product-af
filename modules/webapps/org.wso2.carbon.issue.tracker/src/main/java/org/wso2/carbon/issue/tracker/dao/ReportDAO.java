/*
 * Copyright (c) 2014, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *    WSO2 Inc. licenses this file to you under the Apache License,
 *    Version 2.0 (the "License"); you may not use this file except
 *    in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 */

package org.wso2.carbon.issue.tracker.dao;

import org.wso2.carbon.issue.tracker.bean.Report;
import org.wso2.carbon.issue.tracker.bean.ReportResponse;

import java.sql.SQLException;
import java.util.List;

/**
 * Defines the database operations for a {@link Report}
 */
public interface ReportDAO {

    /**
     * Retrieves a report based on the issue type
     *
     * @param projectKey key id of the project
     * @param tenantId   Tenant ID
     * @return a {@link org.wso2.carbon.issue.tracker.bean.ReportResponse} or null
     * @throws java.sql.SQLException
     */
    public List<ReportResponse> getReportByIssueType(String projectKey, int tenantId) throws SQLException;

    /**
     * Retrieves a report based on the issue priority
     *
     * @param projectKey key id of the project
     * @param tenantId   Tenant ID
     * @return a {@link org.wso2.carbon.issue.tracker.bean.Report} or null
     * @throws java.sql.SQLException
     */
    public List<Report> getReportByPriority(String projectKey, int tenantId) throws SQLException;

    /**
     * Retrieves a report based on the issue reporter
     *
     * @param projectKey key id of the project
     * @param tenantId   Tenant ID
     * @return a {@link org.wso2.carbon.issue.tracker.bean.Report} or null
     * @throws java.sql.SQLException
     */
    public List<Report> getReportByReporter(String projectKey, int tenantId) throws SQLException;

    /**
     * Retrieves a report based on the issue status
     *
     * @param projectKey key id of the project
     * @param tenantId   Tenant ID
     * @return a {@link org.wso2.carbon.issue.tracker.bean.Report} or null
     * @throws java.sql.SQLException
     */
    public List<Report> getReportByStatus(String projectKey, int tenantId) throws SQLException;

    /**
     * Retrieves a report based on the issue assignee
     *
     * @param projectKey key id of the project
     * @param tenantId   Tenant ID
     * @return a {@link org.wso2.carbon.issue.tracker.bean.Report} or null
     * @throws java.sql.SQLException
     */
    public List<Report> getReportByAssignee(String projectKey, int tenantId) throws SQLException;

    /**
     * Retrieves a report based on the issue version
     *
     * @param projectKey key id of the project
     * @param tenantId   Tenant ID
     * @return a {@link org.wso2.carbon.issue.tracker.bean.Report} or null
     * @throws java.sql.SQLException
     */
    public List<Report> getReportByVersion(String projectKey, int tenantId) throws SQLException;

    /**
     * Retrieves a report based on the issue severity
     *
     * @param projectKey key id of the project
     * @param tenantId   Tenant ID
     * @return a {@link org.wso2.carbon.issue.tracker.bean.Report} or null
     * @throws java.sql.SQLException
     */
    public List<Report> getReportBySeverity(String projectKey, int tenantId) throws SQLException;
}
