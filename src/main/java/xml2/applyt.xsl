<?xml version="1.0"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:variable name="header">
        <tr>
            <th>Name</th>
            <th>Address</th>
            <th>State</th>
            <th>Phone</th>
            <th>Phone Acc</th>
        </tr>
    </xsl:variable>


    <xsl:template match="/">
        <HTML>
            <BODY>
                <TABLE border="1" cellspacing="0" cellpadding="2">
                    <xsl:copy-of select="$header"/>
                    <xsl:apply-templates select="customers/customer">
                        <xsl:sort select="state"/>
                        <xsl:sort select="name"/>
                    </xsl:apply-templates>
                    <xsl:copy-of select="$header"/>
                </TABLE>
            </BODY>
        </HTML>
    </xsl:template>

    <xsl:template match="customer">
        <TR>
            <xsl:apply-templates select="name"/>
            <xsl:apply-templates select="address"/>
            <xsl:apply-templates select="state"/>
            <xsl:apply-templates select="phone"/>
            <xsl:apply-templates select="phone" mode="accountNumber"/>
        </TR>
    </xsl:template>

    <xsl:template match="name">
        <TD STYLE="font-size:14pt font-family:serif">
            <xsl:apply-templates/>
        </TD>
    </xsl:template>

    <xsl:template match="address">
        <TD>
            <xsl:apply-templates/>
            <!--<xsl:value-of select="node()"/>-->
            <!--<xsl:value-of select="."/>-->
        </TD>
    </xsl:template>

    <xsl:template match="state">
        <TD>
            <xsl:apply-templates/>
        </TD>
    </xsl:template>

    <xsl:template match="phone">
        <TD>
            <xsl:apply-templates/>
        </TD>
    </xsl:template>

    <xsl:template match="phone" mode="accountNumber">
        <TD STYLE="font-style:italic">
            1-<xsl:value-of select="."/>-001
        </TD>
    </xsl:template>

</xsl:stylesheet>