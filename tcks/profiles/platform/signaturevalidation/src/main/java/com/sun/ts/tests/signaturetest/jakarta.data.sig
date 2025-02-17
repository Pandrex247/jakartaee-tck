#Signature file v4.1
#Version 1.0

CLSS public final !enum jakarta.data.Direction
fld public final static jakarta.data.Direction ASC
fld public final static jakarta.data.Direction DESC
meth public static jakarta.data.Direction valueOf(java.lang.String)
meth public static jakarta.data.Direction[] values()
supr java.lang.Enum<jakarta.data.Direction>

CLSS public final jakarta.data.Limit
cons public init(int,long)
meth public final boolean equals(java.lang.Object)
meth public final int hashCode()
meth public final java.lang.String toString()
meth public int maxResults()
meth public long startAt()
meth public static jakarta.data.Limit of(int)
meth public static jakarta.data.Limit range(long,long)
supr java.lang.Record
hfds DEFAULT_START_AT,maxResults,startAt

CLSS public jakarta.data.Order<%0 extends java.lang.Object>
intf java.lang.Iterable<jakarta.data.Sort<? super {jakarta.data.Order%0}>>
meth public !varargs static <%0 extends java.lang.Object> jakarta.data.Order<{%%0}> by(jakarta.data.Sort<? super {%%0}>[])
 anno 0 java.lang.SafeVarargs()
meth public boolean equals(java.lang.Object)
meth public int hashCode()
meth public java.lang.String toString()
meth public java.util.Iterator<jakarta.data.Sort<? super {jakarta.data.Order%0}>> iterator()
meth public java.util.List<jakarta.data.Sort<? super {jakarta.data.Order%0}>> sorts()
meth public static <%0 extends java.lang.Object> jakarta.data.Order<{%%0}> by(java.util.List<jakarta.data.Sort<? super {%%0}>>)
supr java.lang.Object
hfds sorts

CLSS public final jakarta.data.Sort<%0 extends java.lang.Object>
cons public init(java.lang.String,boolean,boolean)
meth public boolean ignoreCase()
meth public boolean isAscending()
meth public boolean isDescending()
meth public final boolean equals(java.lang.Object)
meth public final int hashCode()
meth public final java.lang.String toString()
meth public java.lang.String property()
meth public static <%0 extends java.lang.Object> jakarta.data.Sort<{%%0}> asc(java.lang.String)
meth public static <%0 extends java.lang.Object> jakarta.data.Sort<{%%0}> ascIgnoreCase(java.lang.String)
meth public static <%0 extends java.lang.Object> jakarta.data.Sort<{%%0}> desc(java.lang.String)
meth public static <%0 extends java.lang.Object> jakarta.data.Sort<{%%0}> descIgnoreCase(java.lang.String)
meth public static <%0 extends java.lang.Object> jakarta.data.Sort<{%%0}> of(java.lang.String,jakarta.data.Direction,boolean)
supr java.lang.Record
hfds ignoreCase,isAscending,property

CLSS public jakarta.data.exceptions.DataConnectionException
cons public init(java.lang.String)
cons public init(java.lang.String,java.lang.Throwable)
cons public init(java.lang.Throwable)
supr jakarta.data.exceptions.DataException
hfds serialVersionUID

CLSS public jakarta.data.exceptions.DataException
cons public init(java.lang.String)
cons public init(java.lang.String,java.lang.Throwable)
cons public init(java.lang.Throwable)
supr java.lang.RuntimeException
hfds serialVersionUID

CLSS public jakarta.data.exceptions.EmptyResultException
cons public init(java.lang.String)
cons public init(java.lang.String,java.lang.Throwable)
cons public init(java.lang.Throwable)
supr jakarta.data.exceptions.DataException
hfds serialVersionUID

CLSS public jakarta.data.exceptions.EntityExistsException
cons public init(java.lang.String)
cons public init(java.lang.String,java.lang.Throwable)
cons public init(java.lang.Throwable)
supr jakarta.data.exceptions.DataException
hfds serialVersionUID

CLSS public jakarta.data.exceptions.MappingException
cons public init(java.lang.String)
cons public init(java.lang.String,java.lang.Throwable)
cons public init(java.lang.Throwable)
supr jakarta.data.exceptions.DataException
hfds serialVersionUID

CLSS public jakarta.data.exceptions.NonUniqueResultException
cons public init(java.lang.String)
cons public init(java.lang.String,java.lang.Throwable)
cons public init(java.lang.Throwable)
supr jakarta.data.exceptions.DataException
hfds serialVersionUID

CLSS public jakarta.data.exceptions.OptimisticLockingFailureException
cons public init(java.lang.String)
cons public init(java.lang.String,java.lang.Throwable)
cons public init(java.lang.Throwable)
supr jakarta.data.exceptions.DataException
hfds serialVersionUID

CLSS abstract interface jakarta.data.exceptions.package-info

CLSS public abstract interface jakarta.data.metamodel.Attribute<%0 extends java.lang.Object>
meth public abstract java.lang.String name()

CLSS public abstract interface jakarta.data.metamodel.SortableAttribute<%0 extends java.lang.Object>
intf jakarta.data.metamodel.Attribute<{jakarta.data.metamodel.SortableAttribute%0}>
meth public abstract jakarta.data.Sort<{jakarta.data.metamodel.SortableAttribute%0}> asc()
meth public abstract jakarta.data.Sort<{jakarta.data.metamodel.SortableAttribute%0}> desc()

CLSS public abstract interface !annotation jakarta.data.metamodel.StaticMetamodel
 anno 0 java.lang.annotation.Documented()
 anno 0 java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy value=RUNTIME)
 anno 0 java.lang.annotation.Target(java.lang.annotation.ElementType[] value=[TYPE])
intf java.lang.annotation.Annotation
meth public abstract java.lang.Class<?> value()

CLSS public abstract interface jakarta.data.metamodel.TextAttribute<%0 extends java.lang.Object>
intf jakarta.data.metamodel.SortableAttribute<{jakarta.data.metamodel.TextAttribute%0}>
meth public abstract jakarta.data.Sort<{jakarta.data.metamodel.TextAttribute%0}> ascIgnoreCase()
meth public abstract jakarta.data.Sort<{jakarta.data.metamodel.TextAttribute%0}> descIgnoreCase()

CLSS public final jakarta.data.metamodel.impl.AttributeRecord<%0 extends java.lang.Object>
cons public init(java.lang.String)
intf jakarta.data.metamodel.Attribute<{jakarta.data.metamodel.impl.AttributeRecord%0}>
meth public final boolean equals(java.lang.Object)
meth public final int hashCode()
meth public final java.lang.String toString()
meth public java.lang.String name()
supr java.lang.Record
hfds name

CLSS public final jakarta.data.metamodel.impl.SortableAttributeRecord<%0 extends java.lang.Object>
cons public init(java.lang.String)
intf jakarta.data.metamodel.SortableAttribute<{jakarta.data.metamodel.impl.SortableAttributeRecord%0}>
meth public final boolean equals(java.lang.Object)
meth public final int hashCode()
meth public final java.lang.String toString()
meth public jakarta.data.Sort<{jakarta.data.metamodel.impl.SortableAttributeRecord%0}> asc()
meth public jakarta.data.Sort<{jakarta.data.metamodel.impl.SortableAttributeRecord%0}> desc()
meth public java.lang.String name()
supr java.lang.Record
hfds name

CLSS public final jakarta.data.metamodel.impl.TextAttributeRecord<%0 extends java.lang.Object>
cons public init(java.lang.String)
intf jakarta.data.metamodel.TextAttribute<{jakarta.data.metamodel.impl.TextAttributeRecord%0}>
meth public final boolean equals(java.lang.Object)
meth public final int hashCode()
meth public final java.lang.String toString()
meth public jakarta.data.Sort<{jakarta.data.metamodel.impl.TextAttributeRecord%0}> asc()
meth public jakarta.data.Sort<{jakarta.data.metamodel.impl.TextAttributeRecord%0}> ascIgnoreCase()
meth public jakarta.data.Sort<{jakarta.data.metamodel.impl.TextAttributeRecord%0}> desc()
meth public jakarta.data.Sort<{jakarta.data.metamodel.impl.TextAttributeRecord%0}> descIgnoreCase()
meth public java.lang.String name()
supr java.lang.Record
hfds name

CLSS abstract interface jakarta.data.metamodel.package-info

CLSS abstract interface jakarta.data.package-info

CLSS public abstract interface jakarta.data.page.CursoredPage<%0 extends java.lang.Object>
intf jakarta.data.page.Page<{jakarta.data.page.CursoredPage%0}>
meth public abstract boolean hasPrevious()
meth public abstract jakarta.data.page.PageRequest nextPageRequest()
meth public abstract jakarta.data.page.PageRequest previousPageRequest()
meth public abstract jakarta.data.page.PageRequest$Cursor cursor(int)

CLSS public abstract interface jakarta.data.page.Page<%0 extends java.lang.Object>
intf java.lang.Iterable<{jakarta.data.page.Page%0}>
meth public abstract boolean hasContent()
meth public abstract boolean hasNext()
meth public abstract boolean hasPrevious()
meth public abstract boolean hasTotals()
meth public abstract int numberOfElements()
meth public abstract jakarta.data.page.PageRequest nextPageRequest()
meth public abstract jakarta.data.page.PageRequest pageRequest()
meth public abstract jakarta.data.page.PageRequest previousPageRequest()
meth public abstract java.util.List<{jakarta.data.page.Page%0}> content()
meth public abstract long totalElements()
meth public abstract long totalPages()
meth public java.util.stream.Stream<{jakarta.data.page.Page%0}> stream()

CLSS public abstract interface jakarta.data.page.PageRequest
innr public abstract interface static Cursor
innr public final static !enum Mode
meth public abstract boolean equals(java.lang.Object)
meth public abstract boolean requestTotal()
meth public abstract int size()
meth public abstract jakarta.data.page.PageRequest afterCursor(jakarta.data.page.PageRequest$Cursor)
meth public abstract jakarta.data.page.PageRequest beforeCursor(jakarta.data.page.PageRequest$Cursor)
meth public abstract jakarta.data.page.PageRequest size(int)
meth public abstract jakarta.data.page.PageRequest withTotal()
meth public abstract jakarta.data.page.PageRequest withoutTotal()
meth public abstract jakarta.data.page.PageRequest$Mode mode()
meth public abstract java.util.Optional<jakarta.data.page.PageRequest$Cursor> cursor()
meth public abstract long page()
meth public static jakarta.data.page.PageRequest afterCursor(jakarta.data.page.PageRequest$Cursor,long,int,boolean)
meth public static jakarta.data.page.PageRequest beforeCursor(jakarta.data.page.PageRequest$Cursor,long,int,boolean)
meth public static jakarta.data.page.PageRequest ofPage(long)
meth public static jakarta.data.page.PageRequest ofPage(long,int,boolean)
meth public static jakarta.data.page.PageRequest ofSize(int)

CLSS public abstract interface static jakarta.data.page.PageRequest$Cursor
 outer jakarta.data.page.PageRequest
meth public !varargs static jakarta.data.page.PageRequest$Cursor forKey(java.lang.Object[])
meth public abstract boolean equals(java.lang.Object)
meth public abstract int hashCode()
meth public abstract int size()
meth public abstract java.lang.Object get(int)
meth public abstract java.lang.String toString()
meth public abstract java.util.List<?> elements()

CLSS public final static !enum jakarta.data.page.PageRequest$Mode
 outer jakarta.data.page.PageRequest
fld public final static jakarta.data.page.PageRequest$Mode CURSOR_NEXT
fld public final static jakarta.data.page.PageRequest$Mode CURSOR_PREVIOUS
fld public final static jakarta.data.page.PageRequest$Mode OFFSET
meth public static jakarta.data.page.PageRequest$Mode valueOf(java.lang.String)
meth public static jakarta.data.page.PageRequest$Mode[] values()
supr java.lang.Enum<jakarta.data.page.PageRequest$Mode>

CLSS public final jakarta.data.page.impl.CursoredPageRecord<%0 extends java.lang.Object>
cons public init(java.util.List<{jakarta.data.page.impl.CursoredPageRecord%0}>,java.util.List<jakarta.data.page.PageRequest$Cursor>,long,jakarta.data.page.PageRequest,boolean,boolean)
cons public init(java.util.List<{jakarta.data.page.impl.CursoredPageRecord%0}>,java.util.List<jakarta.data.page.PageRequest$Cursor>,long,jakarta.data.page.PageRequest,jakarta.data.page.PageRequest,jakarta.data.page.PageRequest)
intf jakarta.data.page.CursoredPage<{jakarta.data.page.impl.CursoredPageRecord%0}>
meth public boolean hasContent()
meth public boolean hasNext()
meth public boolean hasPrevious()
meth public boolean hasTotals()
meth public final boolean equals(java.lang.Object)
meth public final int hashCode()
meth public final java.lang.String toString()
meth public int numberOfElements()
meth public jakarta.data.page.PageRequest nextPageRequest()
meth public jakarta.data.page.PageRequest pageRequest()
meth public jakarta.data.page.PageRequest previousPageRequest()
meth public jakarta.data.page.PageRequest$Cursor cursor(int)
meth public java.util.Iterator<{jakarta.data.page.impl.CursoredPageRecord%0}> iterator()
meth public java.util.List<jakarta.data.page.PageRequest$Cursor> cursors()
meth public java.util.List<{jakarta.data.page.impl.CursoredPageRecord%0}> content()
meth public long totalElements()
meth public long totalPages()
supr java.lang.Record
hfds content,cursors,nextPageRequest,pageRequest,previousPageRequest,totalElements

CLSS public final jakarta.data.page.impl.PageRecord<%0 extends java.lang.Object>
cons public init(jakarta.data.page.PageRequest,java.util.List<{jakarta.data.page.impl.PageRecord%0}>,long)
cons public init(jakarta.data.page.PageRequest,java.util.List<{jakarta.data.page.impl.PageRecord%0}>,long,boolean)
intf jakarta.data.page.Page<{jakarta.data.page.impl.PageRecord%0}>
meth public boolean hasContent()
meth public boolean hasNext()
meth public boolean hasPrevious()
meth public boolean hasTotals()
meth public boolean moreResults()
meth public final boolean equals(java.lang.Object)
meth public final int hashCode()
meth public final java.lang.String toString()
meth public int numberOfElements()
meth public jakarta.data.page.PageRequest nextPageRequest()
meth public jakarta.data.page.PageRequest pageRequest()
meth public jakarta.data.page.PageRequest previousPageRequest()
meth public java.util.Iterator<{jakarta.data.page.impl.PageRecord%0}> iterator()
meth public java.util.List<{jakarta.data.page.impl.PageRecord%0}> content()
meth public long totalElements()
meth public long totalPages()
supr java.lang.Record
hfds content,moreResults,pageRequest,totalElements

CLSS abstract interface jakarta.data.page.package-info

CLSS public abstract interface jakarta.data.repository.BasicRepository<%0 extends java.lang.Object, %1 extends java.lang.Object>
intf jakarta.data.repository.DataRepository<{jakarta.data.repository.BasicRepository%0},{jakarta.data.repository.BasicRepository%1}>
meth public abstract <%0 extends {jakarta.data.repository.BasicRepository%0}> java.util.List<{%%0}> saveAll(java.util.List<{%%0}>)
 anno 0 jakarta.data.repository.Save()
meth public abstract <%0 extends {jakarta.data.repository.BasicRepository%0}> {%%0} save({%%0})
 anno 0 jakarta.data.repository.Save()
meth public abstract jakarta.data.page.Page<{jakarta.data.repository.BasicRepository%0}> findAll(jakarta.data.page.PageRequest,jakarta.data.Order<{jakarta.data.repository.BasicRepository%0}>)
 anno 0 jakarta.data.repository.Find()
meth public abstract java.util.Optional<{jakarta.data.repository.BasicRepository%0}> findById({jakarta.data.repository.BasicRepository%1})
 anno 0 jakarta.data.repository.Find()
meth public abstract java.util.stream.Stream<{jakarta.data.repository.BasicRepository%0}> findAll()
 anno 0 jakarta.data.repository.Find()
meth public abstract void delete({jakarta.data.repository.BasicRepository%0})
 anno 0 jakarta.data.repository.Delete()
meth public abstract void deleteAll(java.util.List<? extends {jakarta.data.repository.BasicRepository%0}>)
 anno 0 jakarta.data.repository.Delete()
meth public abstract void deleteById({jakarta.data.repository.BasicRepository%1})
 anno 0 jakarta.data.repository.Delete()

CLSS public abstract interface !annotation jakarta.data.repository.By
 anno 0 java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy value=RUNTIME)
 anno 0 java.lang.annotation.Target(java.lang.annotation.ElementType[] value=[PARAMETER])
fld public final static java.lang.String ID = "id(this)"
intf java.lang.annotation.Annotation
meth public abstract java.lang.String value()

CLSS public abstract interface jakarta.data.repository.CrudRepository<%0 extends java.lang.Object, %1 extends java.lang.Object>
intf jakarta.data.repository.BasicRepository<{jakarta.data.repository.CrudRepository%0},{jakarta.data.repository.CrudRepository%1}>
meth public abstract <%0 extends {jakarta.data.repository.CrudRepository%0}> java.util.List<{%%0}> insertAll(java.util.List<{%%0}>)
 anno 0 jakarta.data.repository.Insert()
meth public abstract <%0 extends {jakarta.data.repository.CrudRepository%0}> java.util.List<{%%0}> updateAll(java.util.List<{%%0}>)
 anno 0 jakarta.data.repository.Update()
meth public abstract <%0 extends {jakarta.data.repository.CrudRepository%0}> {%%0} insert({%%0})
 anno 0 jakarta.data.repository.Insert()
meth public abstract <%0 extends {jakarta.data.repository.CrudRepository%0}> {%%0} update({%%0})
 anno 0 jakarta.data.repository.Update()

CLSS public abstract interface jakarta.data.repository.DataRepository<%0 extends java.lang.Object, %1 extends java.lang.Object>

CLSS public abstract interface !annotation jakarta.data.repository.Delete
 anno 0 java.lang.annotation.Documented()
 anno 0 java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy value=RUNTIME)
 anno 0 java.lang.annotation.Target(java.lang.annotation.ElementType[] value=[METHOD])
intf java.lang.annotation.Annotation

CLSS public abstract interface !annotation jakarta.data.repository.Find
 anno 0 java.lang.annotation.Documented()
 anno 0 java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy value=RUNTIME)
 anno 0 java.lang.annotation.Target(java.lang.annotation.ElementType[] value=[METHOD])
intf java.lang.annotation.Annotation

CLSS public abstract interface !annotation jakarta.data.repository.Insert
 anno 0 java.lang.annotation.Documented()
 anno 0 java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy value=RUNTIME)
 anno 0 java.lang.annotation.Target(java.lang.annotation.ElementType[] value=[METHOD])
intf java.lang.annotation.Annotation

CLSS public abstract interface !annotation jakarta.data.repository.OrderBy
 anno 0 java.lang.annotation.Repeatable(java.lang.Class<? extends java.lang.annotation.Annotation> value=class jakarta.data.repository.OrderBy$List)
 anno 0 java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy value=RUNTIME)
 anno 0 java.lang.annotation.Target(java.lang.annotation.ElementType[] value=[METHOD])
innr public abstract interface static !annotation List
intf java.lang.annotation.Annotation
meth public abstract !hasdefault boolean descending()
meth public abstract !hasdefault boolean ignoreCase()
meth public abstract java.lang.String value()

CLSS public abstract interface static !annotation jakarta.data.repository.OrderBy$List
 outer jakarta.data.repository.OrderBy
 anno 0 java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy value=RUNTIME)
 anno 0 java.lang.annotation.Target(java.lang.annotation.ElementType[] value=[METHOD])
intf java.lang.annotation.Annotation
meth public abstract jakarta.data.repository.OrderBy[] value()

CLSS public abstract interface !annotation jakarta.data.repository.Param
 anno 0 java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy value=RUNTIME)
 anno 0 java.lang.annotation.Target(java.lang.annotation.ElementType[] value=[PARAMETER])
intf java.lang.annotation.Annotation
meth public abstract java.lang.String value()

CLSS public abstract interface !annotation jakarta.data.repository.Query
 anno 0 java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy value=RUNTIME)
 anno 0 java.lang.annotation.Target(java.lang.annotation.ElementType[] value=[METHOD])
intf java.lang.annotation.Annotation
meth public abstract java.lang.String value()

CLSS public abstract interface !annotation jakarta.data.repository.Repository
 anno 0 java.lang.annotation.Documented()
 anno 0 java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy value=RUNTIME)
 anno 0 java.lang.annotation.Target(java.lang.annotation.ElementType[] value=[TYPE])
fld public final static java.lang.String ANY_PROVIDER = ""
fld public final static java.lang.String DEFAULT_DATA_STORE = ""
intf java.lang.annotation.Annotation
meth public abstract !hasdefault java.lang.String dataStore()
meth public abstract !hasdefault java.lang.String provider()

CLSS public abstract interface !annotation jakarta.data.repository.Save
 anno 0 java.lang.annotation.Documented()
 anno 0 java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy value=RUNTIME)
 anno 0 java.lang.annotation.Target(java.lang.annotation.ElementType[] value=[METHOD])
intf java.lang.annotation.Annotation

CLSS public abstract interface !annotation jakarta.data.repository.Update
 anno 0 java.lang.annotation.Documented()
 anno 0 java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy value=RUNTIME)
 anno 0 java.lang.annotation.Target(java.lang.annotation.ElementType[] value=[METHOD])
intf java.lang.annotation.Annotation

CLSS abstract interface jakarta.data.repository.package-info

CLSS public abstract interface !annotation jakarta.data.spi.EntityDefining
 anno 0 java.lang.annotation.Documented()
 anno 0 java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy value=RUNTIME)
 anno 0 java.lang.annotation.Target(java.lang.annotation.ElementType[] value=[ANNOTATION_TYPE])
intf java.lang.annotation.Annotation

CLSS public abstract interface java.io.Serializable

CLSS public abstract interface java.lang.Comparable<%0 extends java.lang.Object>
meth public abstract int compareTo({java.lang.Comparable%0})

CLSS public abstract java.lang.Enum<%0 extends java.lang.Enum<{java.lang.Enum%0}>>
cons protected init(java.lang.String,int)
innr public final static EnumDesc
intf java.io.Serializable
intf java.lang.Comparable<{java.lang.Enum%0}>
intf java.lang.constant.Constable
meth protected final java.lang.Object clone() throws java.lang.CloneNotSupportedException
meth protected final void finalize()
meth public final boolean equals(java.lang.Object)
meth public final int compareTo({java.lang.Enum%0})
meth public final int hashCode()
meth public final int ordinal()
meth public final java.lang.Class<{java.lang.Enum%0}> getDeclaringClass()
meth public final java.lang.String name()
meth public final java.util.Optional<java.lang.Enum$EnumDesc<{java.lang.Enum%0}>> describeConstable()
meth public java.lang.String toString()
meth public static <%0 extends java.lang.Enum<{%%0}>> {%%0} valueOf(java.lang.Class<{%%0}>,java.lang.String)
supr java.lang.Object
hfds name,ordinal

CLSS public java.lang.Exception
cons protected init(java.lang.String,java.lang.Throwable,boolean,boolean)
cons public init()
cons public init(java.lang.String)
cons public init(java.lang.String,java.lang.Throwable)
cons public init(java.lang.Throwable)
supr java.lang.Throwable
hfds serialVersionUID

CLSS public abstract interface java.lang.Iterable<%0 extends java.lang.Object>
meth public abstract java.util.Iterator<{java.lang.Iterable%0}> iterator()
meth public java.util.Spliterator<{java.lang.Iterable%0}> spliterator()
meth public void forEach(java.util.function.Consumer<? super {java.lang.Iterable%0}>)

CLSS public java.lang.Object
cons public init()
meth protected java.lang.Object clone() throws java.lang.CloneNotSupportedException
meth protected void finalize() throws java.lang.Throwable
 anno 0 java.lang.Deprecated(boolean forRemoval=false, java.lang.String since="9")
meth public boolean equals(java.lang.Object)
meth public final java.lang.Class<?> getClass()
meth public final void notify()
meth public final void notifyAll()
meth public final void wait() throws java.lang.InterruptedException
meth public final void wait(long) throws java.lang.InterruptedException
meth public final void wait(long,int) throws java.lang.InterruptedException
meth public int hashCode()
meth public java.lang.String toString()

CLSS public abstract java.lang.Record
cons protected init()
meth public abstract boolean equals(java.lang.Object)
meth public abstract int hashCode()
meth public abstract java.lang.String toString()
supr java.lang.Object

CLSS public java.lang.RuntimeException
cons protected init(java.lang.String,java.lang.Throwable,boolean,boolean)
cons public init()
cons public init(java.lang.String)
cons public init(java.lang.String,java.lang.Throwable)
cons public init(java.lang.Throwable)
supr java.lang.Exception
hfds serialVersionUID

CLSS public java.lang.Throwable
cons protected init(java.lang.String,java.lang.Throwable,boolean,boolean)
cons public init()
cons public init(java.lang.String)
cons public init(java.lang.String,java.lang.Throwable)
cons public init(java.lang.Throwable)
intf java.io.Serializable
meth public final java.lang.Throwable[] getSuppressed()
meth public final void addSuppressed(java.lang.Throwable)
meth public java.lang.StackTraceElement[] getStackTrace()
meth public java.lang.String getLocalizedMessage()
meth public java.lang.String getMessage()
meth public java.lang.String toString()
meth public java.lang.Throwable fillInStackTrace()
meth public java.lang.Throwable getCause()
meth public java.lang.Throwable initCause(java.lang.Throwable)
meth public void printStackTrace()
meth public void printStackTrace(java.io.PrintStream)
meth public void printStackTrace(java.io.PrintWriter)
meth public void setStackTrace(java.lang.StackTraceElement[])
supr java.lang.Object
hfds CAUSE_CAPTION,EMPTY_THROWABLE_ARRAY,NULL_CAUSE_MESSAGE,SELF_SUPPRESSION_MESSAGE,SUPPRESSED_CAPTION,SUPPRESSED_SENTINEL,UNASSIGNED_STACK,backtrace,cause,depth,detailMessage,serialVersionUID,stackTrace,suppressedExceptions
hcls PrintStreamOrWriter,SentinelHolder,WrappedPrintStream,WrappedPrintWriter

CLSS public abstract interface java.lang.annotation.Annotation
meth public abstract boolean equals(java.lang.Object)
meth public abstract int hashCode()
meth public abstract java.lang.Class<? extends java.lang.annotation.Annotation> annotationType()
meth public abstract java.lang.String toString()

CLSS public abstract interface !annotation java.lang.annotation.Documented
 anno 0 java.lang.annotation.Documented()
 anno 0 java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy value=RUNTIME)
 anno 0 java.lang.annotation.Target(java.lang.annotation.ElementType[] value=[ANNOTATION_TYPE])
intf java.lang.annotation.Annotation

CLSS public abstract interface !annotation java.lang.annotation.Repeatable
 anno 0 java.lang.annotation.Documented()
 anno 0 java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy value=RUNTIME)
 anno 0 java.lang.annotation.Target(java.lang.annotation.ElementType[] value=[ANNOTATION_TYPE])
intf java.lang.annotation.Annotation
meth public abstract java.lang.Class<? extends java.lang.annotation.Annotation> value()

CLSS public abstract interface !annotation java.lang.annotation.Retention
 anno 0 java.lang.annotation.Documented()
 anno 0 java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy value=RUNTIME)
 anno 0 java.lang.annotation.Target(java.lang.annotation.ElementType[] value=[ANNOTATION_TYPE])
intf java.lang.annotation.Annotation
meth public abstract java.lang.annotation.RetentionPolicy value()

CLSS public abstract interface !annotation java.lang.annotation.Target
 anno 0 java.lang.annotation.Documented()
 anno 0 java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy value=RUNTIME)
 anno 0 java.lang.annotation.Target(java.lang.annotation.ElementType[] value=[ANNOTATION_TYPE])
intf java.lang.annotation.Annotation
meth public abstract java.lang.annotation.ElementType[] value()

CLSS public abstract interface java.lang.constant.Constable
meth public abstract java.util.Optional<? extends java.lang.constant.ConstantDesc> describeConstable()

