/* �ǉ����K12 */
SELECT
    id,
    name,
    ranking,
    group_name
FROM
    countries
WHERE
    group_name NOT IN ('A');